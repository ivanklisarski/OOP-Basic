package TheExpanse.model.medic;

import TheExpanse.ColonistsConstants;
import TheExpanse.model.colonists.Colonist;

public abstract class Medic extends Colonist {
    private String sign;


    public Medic(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age);
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
    @Override
    protected int getPotentialBonuses() {
        return ColonistsConstants.MEDIC_CLASS_BONUS;
    }
}
