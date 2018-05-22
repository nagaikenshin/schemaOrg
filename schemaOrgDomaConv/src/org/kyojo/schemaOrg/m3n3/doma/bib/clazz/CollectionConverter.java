package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.COLLECTION;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.Collection;

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
