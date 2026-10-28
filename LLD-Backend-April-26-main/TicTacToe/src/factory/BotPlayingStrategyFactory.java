package factory;

import models.enums.BotDifficulty;
import strategy.BotPlayingStrategy;
import strategy.EasyPlayingStrategy;
import strategy.HardPlayingStrategy;
import strategy.MediumPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getPlayingStrategy(BotDifficulty botDifficulty) {
        if(botDifficulty.equals(BotDifficulty.EASY)) {
            return new EasyPlayingStrategy();
        }
        else if(botDifficulty.equals(BotDifficulty.MEDIUM)) {
            return new MediumPlayingStrategy();
        }
        else return new HardPlayingStrategy();
    }
}
