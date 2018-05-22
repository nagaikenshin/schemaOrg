package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PREGNANCY_WARNING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PregnancyWarning;

@ExternalDomain
public class PregnancyWarningConverter implements DomainConverter<PregnancyWarning, String> {

	@Override
	public String fromDomainToValue(PregnancyWarning domain) {
		return domain.getNativeValue();
	}

	@Override
	public PregnancyWarning fromValueToDomain(String value) {
		return new PREGNANCY_WARNING(value);
	}

}
