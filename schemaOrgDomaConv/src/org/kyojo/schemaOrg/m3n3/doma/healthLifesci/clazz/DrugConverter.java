package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DRUG;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.Drug;

@ExternalDomain
public class DrugConverter implements DomainConverter<Drug, String> {

	@Override
	public String fromDomainToValue(Drug domain) {
		return domain.getNativeValue();
	}

	@Override
	public Drug fromValueToDomain(String value) {
		return new DRUG(value);
	}

}
