package org.kyojo.schemaorg.m3n5.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.COMIC_STORY;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicStory;

@ExternalDomain
public class ComicStoryConverter implements DomainConverter<ComicStory, String> {

	@Override
	public String fromDomainToValue(ComicStory domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComicStory fromValueToDomain(String value) {
		return new COMIC_STORY(value);
	}

}
