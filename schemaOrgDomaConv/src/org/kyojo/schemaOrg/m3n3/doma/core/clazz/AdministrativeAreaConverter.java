package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADMINISTRATIVE_AREA;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AdministrativeArea;

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
