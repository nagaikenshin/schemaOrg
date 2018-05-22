package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.IMAGING_TECHNIQUE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ImagingTechnique;

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
