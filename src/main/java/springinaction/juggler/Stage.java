package springinaction.juggler;

public class Stage {
    private Stage() {
    }
    private static class StageSingletonHolder {
        static Stage instance = new Stage(); // Создание экземпляра
    }
    public static Stage getInstance() {
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }
}
