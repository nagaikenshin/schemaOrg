package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.ROOF_LOAD;
import org.kyojo.schemaorg.m3n4.auto.Container.RoofLoad;

@ExternalDomain
public class RoofLoadConverter implements DomainConverter<RoofLoad, String> {

	@Override
	public String fromDomainToValue(RoofLoad domain) {
		return domain.getNativeValue();
	}

	@Override
	public RoofLoad fromValueToDomain(String value) {
		return new ROOF_LOAD(value);
	}

}
