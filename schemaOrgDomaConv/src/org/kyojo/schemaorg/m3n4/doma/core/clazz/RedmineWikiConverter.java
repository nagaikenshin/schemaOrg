package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REDMINE_WIKI;
import org.kyojo.schemaorg.m3n4.core.Clazz.RedmineWiki;

@ExternalDomain
public class RedmineWikiConverter implements DomainConverter<RedmineWiki, String> {

	@Override
	public String fromDomainToValue(RedmineWiki domain) {
		return domain.getNativeValue();
	}

	@Override
	public RedmineWiki fromValueToDomain(String value) {
		return new REDMINE_WIKI(value);
	}

}
