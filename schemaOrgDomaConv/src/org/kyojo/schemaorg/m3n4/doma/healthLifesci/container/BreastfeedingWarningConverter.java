package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BREASTFEEDING_WARNING;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.BreastfeedingWarning;

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
