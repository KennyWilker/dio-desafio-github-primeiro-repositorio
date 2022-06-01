package padrao;

/**
 * Singleton "apressado"
 *
 */
public class SingletonLayzyHolder {

    private static class InstanceHolder{
        public static SingletonLayzyHolder instancia = new SingletonLayzyHolder();

    }
    private SingletonLayzyHolder(){
        super();
    }

    public static SingletonLayzyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}