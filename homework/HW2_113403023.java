public class HW2_113403023 {
    public static void main(String[] args) {
        WizardGuild guild = new WizardGuild();

        // 建立魔法師
        Wizard w1 = new Wizard();
        w1.setName("Hermione");
        w1.setLevel(120);
        w1.setSpecialty("Time Magic");

        Wizard w2 = new Wizard();
        w2.setName("Harry Potter");
        w2.setLevel(150);
        w2.setSpecialty("Fire Magic");

        Wizard w3 = new Wizard();
        w3.setName("Malfoy");
        w3.setLevel(120);
        w3.setSpecialty("Light Magic");

        Wizard w4 = new Wizard();
        w4.setName("Ron Weasley");
        w4.setLevel(120);
        w4.setSpecialty("Dark Magic");

        Wizard w5 = new Wizard();
        w5.setName("Loard Voldemort");
        w5.setLevel(300);
        w5.setSpecialty("Light Magic");

        // 加入公會
        guild.addWizard(w1);
        guild.addWizard(w2);
        guild.addWizard(w3);
        guild.addWizard(w4);
        guild.addWizard(w5);

        // 1. 列出所有魔法師
        System.out.println("ALL Wizards:");
        guild.listAllWizards();
        System.out.println();

        // 2. 所有魔法師施展法術
        System.out.println("Casting Guild Spells:");
        guild.castGuildSpell();
        System.out.println();

        // 3. 查找特定魔法師
        System.out.println("Find Wizard by Name 'Harry Potter':");
        Wizard found = guild.findWizardByName("Harry Potter");
        if (found != null) {
            System.out.println(found);
        }
        System.out.println();

        // 4. 移除特定魔法師
        System.out.println("Remove Wizard by Name 'Malfoy'");
        guild.removeWizardByName("Malfoy");
        System.out.println();

        // 5. 再次列出所有魔法師
        System.out.println("All Wizards After Removal:");
        guild.listAllWizards();
        System.out.println();

        // 6. 升級魔法師
        System.out.println("Level Up Loard Voldemort:");
        Wizard voldemort = guild.findWizardByName("Loard Voldemort");
        if (voldemort != null) {
            voldemort.levelUp();
            System.out.println(voldemort);
        }
    }
}
