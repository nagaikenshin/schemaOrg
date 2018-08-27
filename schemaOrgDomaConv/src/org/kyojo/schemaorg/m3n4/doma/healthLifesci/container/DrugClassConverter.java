package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DRUG_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DrugClass;

@ExternalDomain
public class DrugClassConverter implements DomainConverter<DrugClass, String> {

	@Override
	public String fromDomainToValue(DrugClass domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugClass fromValueToDomain(String value) {
		return new DRUG_CLASS(value);
	}

}
