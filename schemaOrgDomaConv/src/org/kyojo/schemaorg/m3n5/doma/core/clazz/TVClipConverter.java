package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TV_CLIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVClip;

@ExternalDomain
public class TVClipConverter implements DomainConverter<TVClip, String> {

	@Override
	public String fromDomainToValue(TVClip domain) {
		return domain.getNativeValue();
	}

	@Override
	public TVClip fromValueToDomain(String value) {
		return new TV_CLIP(value);
	}

}
