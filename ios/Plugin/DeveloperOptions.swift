import Foundation

@objc public class DeveloperOptions: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
