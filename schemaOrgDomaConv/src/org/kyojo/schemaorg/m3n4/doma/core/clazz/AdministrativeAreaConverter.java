package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ADMINISTRATIVE_AREA;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdministrativeArea;

@ExternalDomain
public class AdministrativeAreaConverter implements DomainConverter<AdministrativeArea, String> {

	@Override
	public String fromDomainToValue(AdministrativeArea domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdministrativeArea fromValueToDomain(String value) {
		return new ADMINISTRATIVE_AREA(value);
	}

}
