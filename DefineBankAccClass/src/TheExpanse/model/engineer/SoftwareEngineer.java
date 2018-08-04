package TheExpanse.model.engineer;

import TheExpanse.ColonistsConstants;

public class SoftwareEngineer extends Engineer {

    public SoftwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    protected int getPotentialBonuses() {
        return super.getPotentialBonuses() + ColonistsConstants.SOFTWARE_ENGINEER_BONUS;

    }
}
