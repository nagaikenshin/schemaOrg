package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LANDFORM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Landform;

@ExternalDomain
public class LandformConverter implements DomainConverter<Landform, String> {

	@Override
	public String fromDomainToValue(Landform domain) {
		return domain.getNativeValue();
	}

	@Override
	public Landform fromValueToDomain(String value) {
		return new LANDFORM(value);
	}

}
