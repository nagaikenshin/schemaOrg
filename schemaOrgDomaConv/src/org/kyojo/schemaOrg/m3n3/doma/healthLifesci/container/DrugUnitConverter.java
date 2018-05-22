package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DRUG_UNIT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrugUnit;

@ExternalDomain
public class DrugUnitConverter implements DomainConverter<DrugUnit, String> {

	@Override
	public String fromDomainToValue(DrugUnit domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugUnit fromValueToDomain(String value) {
		return new DRUG_UNIT(value);
	}

}
