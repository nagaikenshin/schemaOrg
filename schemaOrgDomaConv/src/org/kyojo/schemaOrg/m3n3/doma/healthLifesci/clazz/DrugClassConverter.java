package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DRUG_CLASS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DrugClass;

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
