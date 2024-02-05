package seminars.vetClinicProject.interfaces;

@FunctionalInterface
public interface Goable {
    double go();// один абстрактный метод, значит интерфейс функциональный
    
    
    // double pi = 3.1415;
    // double foo();
    // default void defaultGo(double speed) {
    //     System.out.println(getClass().getSimpleName() + " движется со скоростью " + speed);
    // }
}
