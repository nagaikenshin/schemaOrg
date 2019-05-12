package org.kyojo.schemaorg.m3n5.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.COLLECTION;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Collection;

@ExternalDomain
public class CollectionConverter implements DomainConverter<Collection, String> {

	@Override
	public String fromDomainToValue(Collection domain) {
		return domain.getNativeValue();
	}

	@Override
	public Collection fromValueToDomain(String value) {
		return new COLLECTION(value);
	}

}
