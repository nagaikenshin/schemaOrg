package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.MANUSCRIPT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Manuscript;

@ExternalDomain
public class ManuscriptConverter implements DomainConverter<Manuscript, String> {

	@Override
	public String fromDomainToValue(Manuscript domain) {
		return domain.getNativeValue();
	}

	@Override
	public Manuscript fromValueToDomain(String value) {
		return new MANUSCRIPT(value);
	}

}
