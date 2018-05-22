package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MANUFACTURER;
import org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer;

@ExternalDomain
public class ManufacturerConverter implements DomainConverter<Manufacturer, String> {

	@Override
	public String fromDomainToValue(Manufacturer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Manufacturer fromValueToDomain(String value) {
		return new MANUFACTURER(value);
	}

}
