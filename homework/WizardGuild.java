import java.util.ArrayList;

public class WizardGuild {
    private ArrayList<Wizard> wizards = new ArrayList<>();

    public void addWizard(Wizard wizard) {
        wizards.add(wizard);
    }

    public Wizard findWizardByName(String name) {
        for (Wizard w : wizards) {
            if (w.getName().equals(name)) {
                return w;
            }
        }
        return null;
    }

    public void removeWizardByName(String name) {
        Wizard wizardToRemove = findWizardByName(name);
        if (wizardToRemove != null) {
            wizards.remove(wizardToRemove);
        }
    }

    public void listAllWizards() {
        for (Wizard w : wizards) {
            System.out.println(w.toString());
        }
    }

    public void castGuildSpell() {
        for (Wizard w : wizards) {
            System.out.println(w.castSpell());
        }
    }
}
