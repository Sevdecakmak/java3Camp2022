public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] krediManagers = new BaseCreditManager[]
                {new TeacherCreditManager(), new HusbandryCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));

        }
    }
}
