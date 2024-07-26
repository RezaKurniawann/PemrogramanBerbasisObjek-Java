public class Rector {
    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("I am a Rector, give a Cumlaude Certificate");
        System.out.println("Congratulations! Please introduce yourself..");

        student.graduate();
        student.getHighGPA();

        System.out.println("-------------------------------------------------");
    }

    public void giveCertificateOfTopStudent(IArchievers student) {
        System.out.println("I am a Rector, give a Certificate of Top Student.");
        System.out.println("Congrattulations! How you can get achievement?");

        student.winTheCompetition();
        student.publishTheJournal();

        System.out.println("-------------------------------------------------");
    }
}
