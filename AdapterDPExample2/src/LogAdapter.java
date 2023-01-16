public class LogAdapter implements ILogger {
    private ThirdPartLogger otherLogger;
    @Override
    public void Logla(String loglanacakVeri) {
        otherLogger = new ThirdPartLogger();
        otherLogger.logAt();
    }
}
