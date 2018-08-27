package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DRUG_UNIT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DrugUnit;

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
