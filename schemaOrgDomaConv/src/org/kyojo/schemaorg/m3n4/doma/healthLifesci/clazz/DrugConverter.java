package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DRUG;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Drug;

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