package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DRUG_STRENGTH;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DrugStrength;

@ExternalDomain
public class DrugStrengthConverter implements DomainConverter<DrugStrength, String> {

	@Override
	public String fromDomainToValue(DrugStrength domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugStrength fromValueToDomain(String value) {
		return new DRUG_STRENGTH(value);
	}

}
