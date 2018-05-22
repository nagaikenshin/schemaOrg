package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.BREASTFEEDING_WARNING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BreastfeedingWarning;

@ExternalDomain
public class BreastfeedingWarningConverter implements DomainConverter<BreastfeedingWarning, String> {

	@Override
	public String fromDomainToValue(BreastfeedingWarning domain) {
		return domain.getNativeValue();
	}

	@Override
	public BreastfeedingWarning fromValueToDomain(String value) {
		return new BREASTFEEDING_WARNING(value);
	}

}
