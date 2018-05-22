package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ALCOHOL_WARNING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AlcoholWarning;

@ExternalDomain
public class AlcoholWarningConverter implements DomainConverter<AlcoholWarning, String> {

	@Override
	public String fromDomainToValue(AlcoholWarning domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlcoholWarning fromValueToDomain(String value) {
		return new ALCOHOL_WARNING(value);
	}

}
