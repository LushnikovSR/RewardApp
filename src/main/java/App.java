import Fabric.*;
import Product.ItemReward;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
//        List<ItemGenerator> fabrics = new ArrayList<>();
//        fabrics.add(new GoldGenerator());
//        fabrics.add(new SilverGenerator());
//        fabrics.add(new BronzeGenerator());
//        fabrics.add(new PlatinumGenerator());
////        fabrics.add(new CooperGenerator());
//        fabrics.add(new GemGenerator());
//        fabrics.add(new EmeraldGenerator());
//        fabrics.add(new RubyGenerator());

        List<ItemReward> rewards = new ArrayList<>();
        Random random = new Random();

        ItemReward product;
        int weight;

        int REWARDS_AMOUNT = 10;

        for (int i = 0; i < REWARDS_AMOUNT; i++) {
            weight = random.nextInt(54);

            if (weight < 10){
                product = (ItemReward) new EmeraldGenerator().createItem();
            } else if (weight >= 10 && weight < 20){
                product = (ItemReward) new SilverGenerator().createItem();
            } else if (weight >= 20 && weight < 30){
                product = (ItemReward) new BronzeGenerator().createItem();
            } else if (weight >= 30 && weight < 40){
                product = (ItemReward) new PlatinumGenerator().createItem();
            } else if (weight >= 40 && weight < 50){
                product = (ItemReward) new RubyGenerator().createItem();
            } else if (weight >= 50 && weight < 53){
                product = (ItemReward) new GoldGenerator().createItem();
            } else {
                product = (ItemReward) new GemGenerator().createItem();
            }

            rewards.add(product);
        }

        for (ItemReward reward: rewards) {
            reward.open();
        }

    }
}
