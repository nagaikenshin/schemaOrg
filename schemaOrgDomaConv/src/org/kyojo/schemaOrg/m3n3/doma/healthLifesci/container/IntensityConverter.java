package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INTENSITY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Intensity;

@ExternalDomain
public class IntensityConverter implements DomainConverter<Intensity, String> {

	@Override
	public String fromDomainToValue(Intensity domain) {
		return domain.getNativeValue();
	}

	@Override
	public Intensity fromValueToDomain(String value) {
		return new INTENSITY(value);
	}

}
