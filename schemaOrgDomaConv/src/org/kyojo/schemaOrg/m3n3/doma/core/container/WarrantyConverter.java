package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WARRANTY;
import org.kyojo.schemaOrg.m3n3.core.Container.Warranty;

@ExternalDomain
public class WarrantyConverter implements DomainConverter<Warranty, String> {

	@Override
	public String fromDomainToValue(Warranty domain) {
		return domain.getNativeValue();
	}

	@Override
	public Warranty fromValueToDomain(String value) {
		return new WARRANTY(value);
	}

}
