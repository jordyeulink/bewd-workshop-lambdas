package nl.han.bewd.lambdas.reis;

public class TeleportatieVervoerStrategy implements VervoerStrategy{
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 1;
    }
}
