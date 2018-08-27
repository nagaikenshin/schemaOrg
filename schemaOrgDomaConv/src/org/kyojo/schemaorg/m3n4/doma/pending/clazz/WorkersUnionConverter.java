package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.WORKERS_UNION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WorkersUnion;

@ExternalDomain
public class WorkersUnionConverter implements DomainConverter<WorkersUnion, String> {

	@Override
	public String fromDomainToValue(WorkersUnion domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkersUnion fromValueToDomain(String value) {
		return new WORKERS_UNION(value);
	}

}
