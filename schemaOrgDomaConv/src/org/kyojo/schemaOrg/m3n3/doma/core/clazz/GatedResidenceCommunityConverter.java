package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GATED_RESIDENCE_COMMUNITY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GatedResidenceCommunity;

@ExternalDomain
public class GatedResidenceCommunityConverter implements DomainConverter<GatedResidenceCommunity, String> {

	@Override
	public String fromDomainToValue(GatedResidenceCommunity domain) {
		return domain.getNativeValue();
	}

	@Override
	public GatedResidenceCommunity fromValueToDomain(String value) {
		return new GATED_RESIDENCE_COMMUNITY(value);
	}

}
