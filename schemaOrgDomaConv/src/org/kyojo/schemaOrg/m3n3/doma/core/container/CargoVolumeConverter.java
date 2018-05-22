package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CARGO_VOLUME;
import org.kyojo.schemaOrg.m3n3.core.Container.CargoVolume;

@ExternalDomain
public class CargoVolumeConverter implements DomainConverter<CargoVolume, String> {

	@Override
	public String fromDomainToValue(CargoVolume domain) {
		return domain.getNativeValue();
	}

	@Override
	public CargoVolume fromValueToDomain(String value) {
		return new CARGO_VOLUME(value);
	}

}
