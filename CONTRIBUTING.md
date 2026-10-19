# Contributing

Contributions that improve correctness, maintainability, tests, or documentation are welcome.

## Workflow

1. Create a focused branch from `main`.
2. Keep each change scoped to one concern.
3. Use JDK 21 and UTF-8 source encoding.
4. Compile the affected module and run its entry point or tests.
5. Update the English and Chinese README files when user-facing behavior changes.
6. Open a pull request using the repository template.

## Code Expectations

- Preserve the existing package structure unless a migration is part of the change.
- Prefer standard Java APIs and the dependencies already present in the repository.
- Do not commit IDE workspace state, generated build output, credentials, or local absolute paths.
- Add focused tests when changing protocol handling, concurrency, persistence, or calculation logic.
- Keep educational examples readable; clarity is more valuable than unnecessary abstraction.

## Verification

The `Java CI` workflow compiles both application tracks and the major desktop, chat, I/O, concurrency, and networking modules. Run the same module compilation locally for changes in those areas. Lombok annotation processing is required for modules that use Lombok.

## Reporting Problems

Use the issue templates for reproducible defects and feature proposals. Security-related reports should follow [SECURITY.md](SECURITY.md).
