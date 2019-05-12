package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_COMPONENT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ArchiveComponent;

@ExternalDomain
public class ArchiveComponentConverter implements DomainConverter<ArchiveComponent, String> {

	@Override
	public String fromDomainToValue(ArchiveComponent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArchiveComponent fromValueToDomain(String value) {
		return new ARCHIVE_COMPONENT(value);
	}

}
