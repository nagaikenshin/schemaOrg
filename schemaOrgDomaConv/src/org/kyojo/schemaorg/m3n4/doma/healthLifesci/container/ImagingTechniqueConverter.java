package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.IMAGING_TECHNIQUE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ImagingTechnique;

@ExternalDomain
public class ImagingTechniqueConverter implements DomainConverter<ImagingTechnique, String> {

	@Override
	public String fromDomainToValue(ImagingTechnique domain) {
		return domain.getNativeValue();
	}

	@Override
	public ImagingTechnique fromValueToDomain(String value) {
		return new IMAGING_TECHNIQUE(value);
	}

}