package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORK_FEATURED;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkFeatured;

@ExternalDomain
public class WorkFeaturedConverter implements DomainConverter<WorkFeatured, String> {

	@Override
	public String fromDomainToValue(WorkFeatured domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkFeatured fromValueToDomain(String value) {
		return new WORK_FEATURED(value);
	}

}
