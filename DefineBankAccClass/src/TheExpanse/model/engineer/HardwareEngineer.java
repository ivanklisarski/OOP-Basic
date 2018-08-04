package TheExpanse.model.engineer;

import TheExpanse.ColonistsConstants;

public class HardwareEngineer extends Engineer {
    public HardwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    protected int getPotentialBonuses() {
        int potential = 0;

        if (this.getAge() < ColonistsConstants.HARDWARE_ENGINEER_AGE_REQUIRED) {
            potential += ColonistsConstants.HARDWARE_ENGINEER_BONUS;
        }

        return super.getPotentialBonuses() + potential;
    }
}
