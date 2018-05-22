package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LANDLORD;
import org.kyojo.schemaOrg.m3n3.core.Container.Landlord;

@ExternalDomain
public class LandlordConverter implements DomainConverter<Landlord, String> {

	@Override
	public String fromDomainToValue(Landlord domain) {
		return domain.getNativeValue();
	}

	@Override
	public Landlord fromValueToDomain(String value) {
		return new LANDLORD(value);
	}

}
