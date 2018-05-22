package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MATERIAL;
import org.kyojo.schemaOrg.m3n3.core.Container.Material;

@ExternalDomain
public class MaterialConverter implements DomainConverter<Material, String> {

	@Override
	public String fromDomainToValue(Material domain) {
		return domain.getNativeValue();
	}

	@Override
	public Material fromValueToDomain(String value) {
		return new MATERIAL(value);
	}

}
