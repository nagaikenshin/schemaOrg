package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOFTWARE_ADD_ON;
import org.kyojo.schemaOrg.m3n3.core.Container.SoftwareAddOn;

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
