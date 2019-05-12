package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VAT_ID;
import org.kyojo.schemaorg.m3n5.core.Container.VatID;

@ExternalDomain
public class VatIDConverter implements DomainConverter<VatID, String> {

	@Override
	public String fromDomainToValue(VatID domain) {
		return domain.getNativeValue();
	}

	@Override
	public VatID fromValueToDomain(String value) {
		return new VAT_ID(value);
	}

}