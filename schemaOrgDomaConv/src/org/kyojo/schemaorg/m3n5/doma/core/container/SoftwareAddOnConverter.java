package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SOFTWARE_ADD_ON;
import org.kyojo.schemaorg.m3n5.core.Container.SoftwareAddOn;

@ExternalDomain
public class SoftwareAddOnConverter implements DomainConverter<SoftwareAddOn, String> {

	@Override
	public String fromDomainToValue(SoftwareAddOn domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoftwareAddOn fromValueToDomain(String value) {
		return new SOFTWARE_ADD_ON(value);
	}

}
