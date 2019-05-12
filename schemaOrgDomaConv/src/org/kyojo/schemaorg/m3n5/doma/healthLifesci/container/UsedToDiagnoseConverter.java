package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.USED_TO_DIAGNOSE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.UsedToDiagnose;

@ExternalDomain
public class UsedToDiagnoseConverter implements DomainConverter<UsedToDiagnose, String> {

	@Override
	public String fromDomainToValue(UsedToDiagnose domain) {
		return domain.getNativeValue();
	}

	@Override
	public UsedToDiagnose fromValueToDomain(String value) {
		return new USED_TO_DIAGNOSE(value);
	}

}
