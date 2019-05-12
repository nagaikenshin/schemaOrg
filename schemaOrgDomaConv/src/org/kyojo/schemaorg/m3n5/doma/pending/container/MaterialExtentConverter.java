package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.MATERIAL_EXTENT;
import org.kyojo.schemaorg.m3n5.pending.Container.MaterialExtent;

@ExternalDomain
public class MaterialExtentConverter implements DomainConverter<MaterialExtent, String> {

	@Override
	public String fromDomainToValue(MaterialExtent domain) {
		return domain.getNativeValue();
	}

	@Override
	public MaterialExtent fromValueToDomain(String value) {
		return new MATERIAL_EXTENT(value);
	}

}
