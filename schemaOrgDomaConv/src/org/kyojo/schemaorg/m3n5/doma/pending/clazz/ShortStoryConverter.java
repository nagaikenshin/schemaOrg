package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.SHORT_STORY;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ShortStory;

@ExternalDomain
public class ShortStoryConverter implements DomainConverter<ShortStory, String> {

	@Override
	public String fromDomainToValue(ShortStory domain) {
		return domain.getNativeValue();
	}

	@Override
	public ShortStory fromValueToDomain(String value) {
		return new SHORT_STORY(value);
	}

}
